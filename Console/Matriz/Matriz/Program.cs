using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Matriz
{
    class Program
    {
        static void Main(string[] args)
        {
            int [,]matriz={{-9,-9,-9,1,1,1},
        		        {0,-9,0,4,3,2},
        		        {-9,-9,-9,1,2,3},
        		        {0,0,8,6,6,0},
        		        {0,0,0,-2,0,0},
        		        {0,0,1,2,4,0}};
     
int[,] matrizResultante = new int[4,4];

  for(int fil=0; fil<4;fil++){
      for(int col=0;col<4;col++){
                  
              matrizResultante[fil,col]=matriz[fil,col]+matriz[fil,col + 1]+matriz[fil,col + 2]+matriz[fil + 1,col + 1]+matriz[fil + 2,col]+matriz[fil + 2,col + 1]+matriz[fil + 2,col + 2];
              Console.Write(matrizResultante[fil,col]+"\t");
    }
              Console.WriteLine();
}
}
        }
    }

