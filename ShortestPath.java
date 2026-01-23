public class ShortestPath {

    public static float Shortestpath(String path){

        int x=0,y=0;
        for(int i=0; i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
        }
        float distance = (float)Math.sqrt(x*x + y*y);
        return distance;
    }
    public static void main(String[] args){

        String path = "WNEENESENNN";
        System.out.println(Shortestpath(path));
    }
}
