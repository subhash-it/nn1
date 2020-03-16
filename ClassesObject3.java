package com.wipro;


    class Patient
    {
        private String name;
        private double height;
        private double width;

        public Patient(String name, double height, double width)
        {
            super();
            this.name = name;
            this.height = height;
            this.width = width;
        }

        public double ComputeBMI ()
        {
            return ( width / ( height * height ) ) * 703;
        }
    }

    public class ClassesObject3
    {

        public static void main(String[] args)
        {
            Patient p = new Patient("Rohan Singh", 165/2.52, 38*2.2);

            System.out.println(p.ComputeBMI());

        }

    }
