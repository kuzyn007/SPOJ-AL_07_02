/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/AL_07_02/
 */

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = readInt(br);
		for(int i=0; i<n; i++)
		{
			int sx = readInt(br);
			int sy = readInt(br);
			int mx = readInt(br);
			int my = readInt(br);
			int d = readInt(br);
			int znak = br.read();
			int x=0;
			int y=0;
			int dzien=1;
			while (znak != 'N' && znak != 'S' && znak != 'W' && znak != 'E')
			{
			znak = br.read();
			}
			for (int j = 0 ; j < d ; j++) 
			
			{
				

				//System.out.print(znak + ", ");
				
				// SPRAWDZANIE KIERUNKÓW WIATRU:
				if(znak == 'N')
				{
					y=sy+1;
					if(Math.abs(y-my) <= Math.abs(sy-my))
					{
						sy = y;
					}
				}
				if(znak == 'S')
				{
					y=sy-1;
					if(Math.abs(y-my) <= Math.abs(sy-my))
					{
						sy = y;
					}
				}
				if(znak == 'W')
				{
					x=sx-1;
					if(Math.abs(x-mx) <= Math.abs(sx-mx))
					{
						sx = x;
					}
				}
				if(znak == 'E')
				{
					x=sx+1;
					if(Math.abs(x-mx) <= Math.abs(sx-mx))
					{
						sx = x;
					}
				}
				if(sx == mx && sy == my)
				{
					
				}
				else
				{
					dzien += 1;	
				}	
				//System.out.println("OBECNE MIEJSCE: " + sx + ", " + sy);
				znak = br.read();
			}
			//System.out.println(sx + " " + sy + " " + mx + " " + my + " " + d + "\n" + NESW);

			if(sx == mx && sy == my)
			{
				System.out.println(dzien);
			}
			else
			{
				System.out.println("NIE");
			}
			
			//System.out.println("META: " + mx + ", " + my);
		}
	}
	public static int readInt(BufferedReader br) throws IOException
	{
		//Wczytywaj znaki (spacje, entery i takie tam) az bedzie jakas cyfra (minus zmienia na ujemna)
		int znak;
		int wynik = 0;
		int znakLiczby = 1;
		do 
		{
			znak = br.read();
			if (znak == '-')
			{
				znakLiczby = -1;
				continue;
			}
		} while (znak < '0' || znak > '9');
		wynik = 0;
		//Wczytywaj cyfry i tworz inta, az napotkasz inny znak
		while ( (znak >= '0' && znak <= '9'))
		{
			wynik = wynik * 10 + znak - '0';
			znak = br.read();
		}
		return wynik * znakLiczby;
	}

}

