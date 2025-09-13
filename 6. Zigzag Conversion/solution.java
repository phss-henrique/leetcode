class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] linhas = new StringBuilder[numRows];
        if (numRows==1){
            return s;
        }
        for(int i =0; i<numRows;i++){
            linhas[i] = new StringBuilder(); 
        }
        boolean otherDir = false;
        int countRow = 0;
        for(int i = 0; i<s.length();i++){
            linhas[countRow].append(s.charAt(i));
            if(countRow == 0){
                otherDir = false;
            }else if (countRow == numRows - 1){
                otherDir = true;
            }
            if(otherDir == false) {
                countRow +=1;
            }else{ 
                countRow -=1;
                }
        }
        StringBuilder resultado = new StringBuilder();
        for (StringBuilder word : linhas) {
            resultado.append(word);
        }
        return resultado.toString();
    }
}
