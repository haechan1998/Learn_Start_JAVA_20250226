package programers;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution1{
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(queries[i][j] == arr[i]){
                    arr[i] = j;
                    answer = arr;
                }
            }
        }
        
        return answer;
    }
}
