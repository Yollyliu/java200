package com.yl;


import org.apache.commons.cli.*;

public class zzMath {

    public static void main(String[] args) {
        Options options=new Options();
        options.addOption("a","add", false,"add operator");
        options.addOption("s","sub", false,"sub operator");

        CommandLineParser parser=new DefaultParser();

        try{
            CommandLine commandLine=parser.parse(options,args);
            if(commandLine.hasOption("a")){
                String[] remainArgs=commandLine.getArgs();
                Double v1=Double.valueOf(remainArgs[0]);
                Double v2=Double.valueOf(remainArgs[1]);
                System.out.println(v1+v2);



            }else if(commandLine.hasOption("b")){
                String[] remainArgs=commandLine.getArgs();
                Double v1=Double.valueOf(remainArgs[0]);
                Double v2=Double.valueOf(remainArgs[1]);
                System.out.println(v1-v2);

            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
