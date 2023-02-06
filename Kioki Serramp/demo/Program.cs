using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace demo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double x;
            double y;
            double sum;

            Console.Write("Input value for x");
            x = double.Parse(Console.ReadLine());
            Console.Write("Input value for y");
            y = double.Parse(Console.ReadLine());
            sum = x * y;
            sum = double.Parse(Console.ReadLine());

           Console.WriteLine("The product of x and y is:"+sum)

        }
    }
}
