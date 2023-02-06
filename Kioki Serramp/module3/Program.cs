using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace module3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1, num2, num3, num4;
            double ave,  num5;
            Console.Write("Enter Test Score 1:");
            num1 = int.Parse(Console.ReadLine());
            Console.Write("Enter Test Score 2:");
            num2 = int.Parse(Console.ReadLine());
            Console.Write("Enter Test Score 3:");
            num3 = int.Parse(Console.ReadLine());
            Console.Write("Enter Test Score 4:");
            num4 = int.Parse(Console.ReadLine());
            Console.Write("Enter Test Score 5:");
            num5 = int.Parse(Console.ReadLine());

            ave = (num1 + num2 + num3 + num4 + num5 )/ 5;
            Console.WriteLine("Average Test Score " +ave );
            ave = double.Parse(Console.ReadLine());
           
        }
    }
}
