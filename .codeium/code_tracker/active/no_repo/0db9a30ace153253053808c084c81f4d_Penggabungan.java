
<c:\Users\ASUS\Alifa Izzatunnisa\JavaLanjut\Penggabungan.java™import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Penggabungan {

    public static void main(String[] args) {
        // Nama File Input
        String[] inputFiles = {"File1.txt", "File2.txt", "File3.txt"};
        // Nama File Output
        String outputFile = "outputpenggabungan.txt";

        // Membaca Konten Dari Semua File Input Dan Menyampaikannya Dalam List
        List<String> allLines = new ArrayList<>();
        
        for (String inputFile : inputFiles) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    allLines.add(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + inputFile);
                e.printStackTrace();
            }
        }

        // Menulis Konten Yang Sudah DiGabungkan Ke File Output
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            for (String line : allLines) {
                writer.println(line);
            }
            System.out.println("File output berhasil dibuat: " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + outputFile);
            e.printStackTrace();
        }
    }
}
  . :*$1d9eb432-24d7-45ab-bccb-bea7696a73840:H HN NX Xu u}	}’ 0’Ç*$3815cfee-46cb-4d52-a1ad-462777fdecee0ÇÉ0Éä*$aafbdc36-76ab-4956-bfd0-9a1a4210382e0
äí 
íž ž®0®°*$fa68e90e-725a-4386-9049-3aa753112c760
°¶ 
¶Ñ 0Ñö*$3b16c422-829a-4c07-8698-1d9b03d617940
ö÷ 0÷ø*$3b16c422-829a-4c07-8698-1d9b03d617940
ø‚ 0‚•*$dacb65ba-6aa7-4891-86a1-262dc359f9f80
•Ÿ 2Ÿº *$c847066d-8529-48e3-8bab-419f00b53f7f0º»0»Æ*$84feac53-d258-432b-9f30-ead1db0a56ed02ÆÌ *$c847066d-8529-48e3-8bab-419f00b53f7f0
Ì¨ 2¨µ *$5ccf5e52-bc9c-479c-b7b3-daf95f3897c20µº2ºÒ *$5ccf5e52-bc9c-479c-b7b3-daf95f3897c20
ÒÔ ÔÜ
Ü‹ 
‹™ 
™Ÿ Ÿ¬
¬· 
·É ÉÍ
Íâ 
âã 
ãå 
åæ 
æø 0ø„*$d53978ba-1845-4a02-ad7d-4794e8127fac0
„– 
–Â 
ÂØ Øä0äë*$0244082f-7e59-4390-9fcc-50fcee79589c0
ëý 
ýþ 
þŒ 
ŒŽ 2Ž¤ *$b6970998-5481-43dc-83d5-27f2eee95bed0
¤¥ 
¥€ 0€”*$b0b63c46-d5f6-43aa-bd8b-9af02b39b5bc0
”¢ 
¢£ 
£º º×0×ñ*$ac2cd910-77ad-43b6-af2a-ddfca72bf4540
ñû 2û¤
 *$ac2cd910-77ad-43b6-af2a-ddfca72bf4540¤
§
2§
³
 *$ac2cd910-77ad-43b6-af2a-ddfca72bf4540³
ú
2ú
¥ *$ac2cd910-77ad-43b6-af2a-ddfca72bf4540¥©2©ª *$ac2cd910-77ad-43b6-af2a-ddfca72bf4540ª¯2¯µ *$ac2cd910-77ad-43b6-af2a-ddfca72bf4540µÖ2Ö× *$ac2cd910-77ad-43b6-af2a-ddfca72bf4540×Ý2Ýà *$ac2cd910-77ad-43b6-af2a-ddfca72bf4540
àŒ 
Œ” ”——™