public class WFA {

    public static int editD (String word1, String word2){

        int [][] eDM = new int[word1.length()][word2.length()];

        for(int i = 0; i < word1.length(); i++){
            eDM[i][0] = i;
        }
        for(int i = 0; i < word2.length(); i++){
            eDM[0][i] = i;
        }
        for(int i = 1; i < word1.length(); i++){
            for (int j = 1; j < word2.length(); j++){
                if(word1.charAt(i) == word2.charAt(j)){
                    eDM[i][j] = eDM[i - 1][j - 1];
                }
                else{
                    eDM[i][j] = Math.min(Math.min(eDM[i-1][j], eDM[i][j-1]), eDM[i-1][j-1]) + 1;
                }
            }
        }
        return eDM[word1.length()-1][word2.length()-1];
    }

}
