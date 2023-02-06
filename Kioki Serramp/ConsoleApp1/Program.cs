using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float hr, min, sec, output;
            Console.Write("Enter Alapsed time in Seconds :");
            sec = int.Parse(Console.ReadLine());

            min = sec / 60;
            hr = sec % 60;

            output: = (hr + min + sec) ;
            Console.WriteLine("The Output is : " + output);
            Console.ReadLine();
            
        }
    }
}
