public class Tempo {

    private int segundo;
    private int hora;
    private int minuto;

    public Tempo(int hh, int mm, int ss){
        if(hh > 23 || mm > 59 || ss > 59){
            hora = 0;
            minuto = 0;
            segundo = 0;
        }else {
            hora = hh;
            minuto = mm;
            segundo = ss;
        }
    }

    public Tempo(){
        segundo = 0;
        hora = 0;
        hora = 0;
    }

    public Tempo(int hh, int mm){
        if(hh>23||mm>59){
            hora = 00;
            minuto = 0;
        }else {
            hora = hh;
            minuto = mm;
        }
        segundo = 0;
    }

    public Tempo(int hh){
        if(hh>23){
            hora = 00;
        }else{
            hora = hh;
        }

        minuto = 0;
        segundo = 0;
    }

    public String toString(){
        return hora+":"+minuto+":"+segundo;
    }

    public boolean setHora(int hora) {
        if(hora > 23) return false;
        this.hora = hora;
        return true;
    }

    public boolean setMinuto(int minuto) {
        if(minuto > 59) return false;
        this.minuto = minuto;
        return true;
    }

    public boolean setSegundo(int segundo) {
        if(segundo > 59) return false;
        this.segundo = segundo;
        return true;
    }

    public void setHorario(int hh,int mm,int ss){
        if(hh>23|| mm>59 ||ss>59){
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }else {
            this.hora = hh;
            this.minuto = mm;
            this.segundo = ss;
        }
    }

    public long diff(Tempo t){
        long hh = hora*3600, mm = minuto*60, st = hh+mm+segundo;
        long h1 = t.hora*3600, m1 = t.minuto*60, st1 = h1+m1+t.segundo;

        /*if(st < st1){
            return st1 - st;
        }else{
            return st - st1;
        }*/

        int result = (int) Math.abs(st1-st);
        return  result;

    }

    public long toSeconds(){
        return hora*3600+minuto*60+segundo;
    }
}
