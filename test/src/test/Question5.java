package test;

public class Question5 {
	/* 문제 5. 연못 깊이 구하기 */
	public static void main(String[] args) {
		int[][] paramArr = {
			 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
			,{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }
			,{ 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 }
			,{ 0, 1, 1, 1, 1, 1, 1, 0, 0, 0 }
			,{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 }
			,{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 }
			,{ 0, 0, 1, 1, 1, 1, 1, 1, 0, 0 }
			,{ 0, 0, 0, 1, 1, 1, 1, 0, 0, 0 }
			,{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }
			,{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
		};
		
		int[][] result = getPondDepth(paramArr);
		
		for( int[] arr : result ) {
			for( int num : arr ) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public static int[][] getPondDepth(int[][] pondInfo) {
		if ( pondInfo.length == 0 ) {
			return pondInfo;
		}

		int width = pondInfo[0].length;
		int height = pondInfo.length;
		
		for( int i = 1; i < height-1; i++ ) {	
			for( int j = 1; j < width-1; j++ ) {
				if( pondInfo[i][j] == 1 ) {
					int numLeft	= 0
					  , numRight = 0
					  , numTop = 0
					  , numBottom = 0;
					
					/* 상하좌우 0보다 큰 요소의 개수 구하기 */
					// case1. 왼쪽 
					for( int k = j-1; k >= 0; k-- ) {
						if( pondInfo[i][k] > 0 ) {
							numLeft++;
						} else {
							break;
						}
					}
					
					// case2. 오른쪽
					for( int k = j+1; k < width; k++ ) {
						if( pondInfo[i][k] > 0 ) {
							numRight++;
						} else {
							break;
						}
					}
					
					// case2. 위
					for( int k = i-1; k >= 0; k-- ) {
						if( pondInfo[k][j] > 0 ) {
							numTop++;
						} else {
							break;
						}
					}
					
					// case2. 아래
					for( int k = i+1; k < height; k++ ) {
						if( pondInfo[k][j] > 0 ) {
							numBottom++;
						} else {
							break;
						}
					}
					
					/* 최소값 구하기 */
					int[] numArr = { numLeft, numRight, numTop, numBottom };
					int minNum = numLeft;
					for ( int num : numArr ) {
						if ( minNum > num ) {
							minNum = num;
						}
					}
					
					pondInfo[i][j] = minNum+1;
				} // End if
			} // End for j
		} // End for i
		
		return pondInfo;
	}
	
}
