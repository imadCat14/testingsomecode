package package_3;

public class Computer {
     int hdd = 0;
     int ram = 0;
     String monitor;
     String keyboard;
     static String mouse;

     public Computer(){

     }

    public Computer(int hdd, int ram, String monitor, String keyboard) {
        this.hdd = hdd;
        this.ram = ram;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public int getHdd() {
        if(hdd<500){
            System.out.println("get some additional HDD, trash!");
        }
        return hdd;
    }

    public void setHdd(int hdd) {
        if(hdd<0){
            System.out.println("<0!!! ALERT!!@!");
        }
        else{this.hdd = hdd;}
    }

    public int getRam() {
        if(ram<512){
            System.out.println("go for new RAM, trash!");
        }
        return ram;
    }

    public void setRam(int ram) {
        if(ram<0){
            System.out.println("<0 ALERT!@D2d3");
        }
        else{this.ram = ram;}
    }
}
