using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;



namespace TPVIII2
{
    class Program
    {
        static void Main(string[] args)
        {

            {
                int min = char.MinValue, max = char.MaxValue;
                Console.WriteLine("Storage size for float :" + sizeof(float));
                Console.WriteLine("MIN: " + float.MinValue);
                Console.WriteLine("MAX: " + float.MaxValue);
                Console.WriteLine("Storage size for int :" + sizeof(int));
                Console.WriteLine("MIN: " + int.MinValue);
                Console.WriteLine("MAX: " + int.MaxValue);
                Console.WriteLine("Storage size for double :" + sizeof(double));
                Console.WriteLine("MIN: " + double.MinValue);
                Console.WriteLine("MAX: " + double.MaxValue);
                Console.WriteLine("Storage size for short :" + sizeof(short));
                Console.WriteLine("MIN: " + short.MinValue);
                Console.WriteLine("MAX: " + short.MaxValue);
                Console.WriteLine("Storage size for long :" + sizeof(long));
                Console.WriteLine("MIN: " + long.MinValue);
                Console.WriteLine("MAX: " + long.MaxValue);
                Console.WriteLine("Storage size for char :" + sizeof(char));
                Console.WriteLine("MIN: " + min);
                Console.WriteLine("MAX: " + max );
                Console.WriteLine("Storage size for Boolean :" + sizeof(Boolean));
                Console.WriteLine("Boolean values: [" + bool.FalseString + " , " + bool.TrueString + "]");
            }
        }

    }
}

