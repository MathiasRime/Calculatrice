package calculatrice;

public class Calculatrice {

    public int add(int a,int b){
        return a + b;
    }

    public int sub(int a,int b){
        return a - b;
    }

    public int multiple(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        if(b == 0){
            return -1;
        }

        return a/b;
    }

    public float average(int a[]){
        int temp = 0;
        for(int i = 0; i < a.length;i++){
            temp += a[i];
        }
        return temp/a.length;
    }
}
