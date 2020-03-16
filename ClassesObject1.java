package com.wipro;
    class Box
    {
        private double width;
        private double height;
        private double depth;

        public Box(double width, double height, double depth)
        {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        public double getVolume()
        {
            return width * height * depth;
        }
    }

    public class  ClassesObject1 {

        public static void main(String[] args)
        {
            Box b= new Box(32, 15, 7);
            System.out.println(b.getVolume());
        }
}
