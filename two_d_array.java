public class two_d_array {
    public static void main(String[] args){
        char[][] telephone = { 
                               {'1','2','3'},
                               {'4','5','6'}, 
                               {'7','8','9'},
                               {'*','0','#'}
                            };
        for(char[] row: telephone){
            for(char column: row){
                System.out.print(column + "\t");
            }
            System.out.println("\n");
        }
    }
}
