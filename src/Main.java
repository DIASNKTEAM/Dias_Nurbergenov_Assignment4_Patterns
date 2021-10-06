public class Main {
    public static void main(String[] args){
        Messi leo = new Messi();
        Cristiano ronaldo = new Cristiano();
        PeakOfMessi peakOfMessi = new PeakOfMessi(leo);
        PeakOfCristiano peakOfCristiano = new PeakOfCristiano(ronaldo);
        System.out.println(peakOfMessi.getPrice());
        System.out.println(peakOfCristiano.getPrice());
    }
}
