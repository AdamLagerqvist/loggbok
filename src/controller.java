public class controller {

    public commandline_interface Interface;
    public loggbok loggbok;

    public controller(commandline_interface Interface, loggbok loggbok) {
        this.Interface = Interface;
        this.loggbok = loggbok;
    }

    public static void main(String[] args) {
        new controller(new commandline_interface(), new loggbok());
    }
}
