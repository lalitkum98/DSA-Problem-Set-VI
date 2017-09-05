package ProblemSetVI;
import java.util.stream.LongStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
public class MarbleGame {
// By Amazon hakerearth
		public void marbleGame(int placingCost[][], int gettingCost[][],
				String marblesLocation[][], int gameMatrixSize) {
			int placingFinalCost = 0;
			int gettingFinalCost = 0;
			for (int i = 0; i < marblesLocation.length; i++) {
				for (int j = 0; j < marblesLocation[0].length; j++) {
					if (marblesLocation[i][j].equals("*")) {
						placingFinalCost = placingFinalCost + placingCost[i][j];
						gettingFinalCost = gettingFinalCost + gettingCost[i][j];
					} else if (marblesLocation[i][j].equals(".")) {
						if (isDominated( marblesLocation, i, j)) {
							gettingFinalCost = gettingFinalCost + gettingCost[i][j];
						}
					}
				}
			}
			System.out.println(placingFinalCost-gettingFinalCost);
		}

		public boolean isDominated(String marblesLocation[][], int i , int j){
			if( (i+1)<marblesLocation.length && marblesLocation[i+1][j].equals(".") ){
				return false;
			}
			if( (j+1)<marblesLocation[0].length && marblesLocation[i][j+1].equals(".") ){
				return false;
			}
			if( (i-1)>=0 && marblesLocation[i-1][j].equals(".") ){
				return false;
			}
			if( (j-1)>=0 && marblesLocation[i][j-1].equals(".") ){
				return false;
			}
				
			return true;
		}
		public static void main(String args[]) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int placingCost[][] = null, gettingCost[][] = null;
			int gameMatrixSize = 0;
			String marblesLocation[][] = null;
			int noTestCases = Integer.valueOf(br.readLine());

			for (int i = 0; i < noTestCases; i++) {
				gameMatrixSize = Integer.valueOf(br.readLine());
				placingCost = new int[gameMatrixSize][gameMatrixSize];
				gettingCost = new int[gameMatrixSize][gameMatrixSize];
				marblesLocation = new String[gameMatrixSize][gameMatrixSize];
				for (int j = 0; j < gameMatrixSize; j++) {
					String placingCostRow = br.readLine();
					String[] values = placingCostRow.split(" ");
					for (int k = 0; k < gameMatrixSize; k++) {
						placingCost[j][k] = Integer.valueOf(values[k]);
					}
				}
				for (int j = 0; j < gameMatrixSize; j++) {
					String gettingCostRow = br.readLine();
					String[] values = gettingCostRow.split(" ");
					for (int k = 0; k < gameMatrixSize; k++) {
						gettingCost[j][k] = Integer.valueOf(values[k]);
					}
				}
				for (int j = 0; j < gameMatrixSize; j++) {
					String marblesLocationRow = br.readLine();
					String[] values = marblesLocationRow.split("");
					for (int k = 0; k < gameMatrixSize; k++) {
						marblesLocation[j][k] = values[k];
					}
				}

			}
			MarbleGame test = new MarbleGame();
			test.marbleGame(placingCost, gettingCost, marblesLocation,
					gameMatrixSize);

		}
	}


