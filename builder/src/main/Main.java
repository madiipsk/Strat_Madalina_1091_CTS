package main;

import clase.Autobuz;
import clase.AutobuzBuilder;
import clase.AutobuzBuilderV2;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1;
        Autobuz autobuz2;
        Autobuz autobuz3;
        AutobuzBuilder builder=new AutobuzBuilder();
        autobuz1=builder.build();
        autobuz2=new AutobuzBuilder().setNumeSofer("Marian").build();
        autobuz3=new AutobuzBuilder().setStop(false).setNrInmatriculare("B333AAA").build();

        System.out.println(autobuz1);
        System.out.println(autobuz2);
        System.out.println(autobuz3);

        AutobuzBuilderV2 autobuzBuilder=new AutobuzBuilderV2();
        Autobuz a1= autobuzBuilder.setStop(true).setOpenDoors(true).setText("La multi ani!").build();
        Autobuz a2=autobuzBuilder.setNumeSofer("Ionica").build();
        Autobuz a3=autobuzBuilder.build();
        System.out.println("Noile autobuze");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
