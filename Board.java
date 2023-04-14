public class Board {
    
    int w, h;
    int b[][];

    public Board (int w, int h){
        this.w = w;
        this.h = h;
        this.b = new int[h][w];   
        for(int j = 0; j < h; j++){
            for(int k = 0; k < w; k++){
                b[j][k] = 0;
            }
        }     
    }

    public void print (){
        for(int j = 0; j < h; j++){
            for(int k = 0; k < w; k++){
                if(k == w - 1){
                    System.out.println("");
                }
                System.out.print(b[j][k] + "*");
            }
        }
    }
}
