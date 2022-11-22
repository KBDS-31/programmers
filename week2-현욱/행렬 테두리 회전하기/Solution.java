class Solution {
    public int arr[][], min;
    public void init(int rows, int columns) {
        arr = new int[rows][columns];
        int cnt = 1;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                arr[i][j] = cnt++;
            }
        }
    }
    public void rotate(int rs, int re, int cs, int ce) {
        int temp = arr[rs][cs];
        min = Math.min(temp, min);
		for(int i=rs; i<re; i++) {
            arr[i][cs] = arr[i+1][cs]; 
            min = Math.min(arr[i+1][cs], min);
        }
        for(int i=cs; i<ce; i++) {
            arr[re][i] = arr[re][i+1];  
            min = Math.min(arr[re][i+1], min);
        } 
		for(int i=re; i>rs; i--) {
            arr[i][ce] = arr[i-1][ce];
            min = Math.min(arr[i-1][ce], min);
        } 
		for(int i=ce; i>cs; i--) {
            arr[rs][i] = arr[rs][i-1];
            min = Math.min(arr[rs][i-1], min);            
        }
        arr[rs][cs+1] = temp;
    }
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        init(rows, columns);
        for(int i=0; i<queries.length; i++) {
            min = Integer.MAX_VALUE;
            rotate(queries[i][0]-1, queries[i][2]-1, queries[i][1]-1, queries[i][3]-1);
            answer[i] = min;
        }
        return answer;
    }
}
