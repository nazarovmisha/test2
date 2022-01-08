public class Sklad {

        int l,r;
void addRight (int n){
    r+=n;
        }
        void addLeft(int n){
    l+=n;
        }
        String getSituation(){
    if (r==l) return "=";
    else if (r>l) return "r";
    else return "l";
        }
    }
