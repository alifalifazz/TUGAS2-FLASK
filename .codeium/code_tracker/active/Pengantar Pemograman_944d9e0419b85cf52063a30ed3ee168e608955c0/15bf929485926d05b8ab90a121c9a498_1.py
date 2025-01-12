
Fc:\Users\ASUS\Alifa Izzatunnisa\Pengantar Pemograman\TugasMandiri\1.py∏def main():
  while True:
    print("Pemain 1: Silahkan anda pilih Gunting, Batu, Kertas -> ", end="")
    pilihan_anda = input().lower()
    while pilihan_anda not in ["gunting", "batu", "kertas"]:
      print("Pilihan tidak tersedia, silahkan piliha Ya/y atau Tidak/t!")
      print("Pemain 1: Silahkan anda pilih Gunting, Batu, Kertas -> ", end="")
      pilihan_anda = input().lower()

    pilihan_komputer = random.choice(["gunting", "batu", "kertas"])

    print(f"Pemain 2: Silahkan anda pilih Gunting, Batu, Kertas -> {pilihan_komputer}")

    if pilihan_anda == pilihan_komputer:
      print("Seri")
    elif (pilihan_anda == "gunting" and pilihan_komputer == "kertas") or \
         (pilihan_anda == "batu" and pilihan_komputer == "gunting") or \
         (pilihan_anda == "kertas" and pilihan_komputer == "batu"):
      print("Pemain 1 Menang")
    else:
      print("Pemain 2 Menang")

    print("Apakah Anda Ingin memulai Permainan Awal lagi [Ya/y] atau [Tidak/t] -> ", end="")
    lagi = input().lower()
    while lagi not in ["ya", "y", "tidak", "t"]:
      print("Pilihan tidak tersedia, silahkan piliha Ya/y atau Tidak/t!")
      print("Apakah Anda Ingin memulai Permainan Awal lagi [Ya/y] atau [Tidak/t] -> ", end="")
      lagi = input().lower()

    if lagi == "ya" or lagi == "y":
      print("Permainan Baru Akan Dimulai")
    else:
      print("GAME OVER")
      break

if __name__ == "__main__":
  main()ì
 
ì
î
 î
ï

ï
ñ
 ñ
ó

ó
õ
 õ
ù

ù
û
 û
ü

ü
´
 ´
≠

≠
¡
 
¡
–
 
–
’
 ’
÷

÷
Â
 
Â
Ê
 Ê
Ë

Ë
∏ "(944d9e0419b85cf52063a30ed3ee168e608955c0*4c:\Users\ASUS\Alifa Izzatunnisa\Pengantar Pemograman