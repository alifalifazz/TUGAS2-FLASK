
Fc:\Users\ASUS\Alifa Izzatunnisa\Pengantar Pemograman\TugasMandiri\2.py∏def hitung_karakter(string):
    """
    Fungsi untuk menghitung jumlah karakter huruf dan angka dalam sebuah string.

    Args:
        string (str): String yang akan dihitung karakternya.

    Returns:
        tuple: Tuple berisi jumlah huruf dan angka.
    """
    huruf = 0
    angka = 0
    for karakter in string:
        if karakter.isalpha():
            huruf += 1
        elif karakter.isdigit():
            angka += 1
    return huruf, angka

# Input dari pengguna
inputan = input("Masukkan inputan: ")

# Menghitung jumlah karakter huruf dan angka
huruf, angka = hitung_karakter(inputan)

# Menampilkan hasil
print("Kata:", huruf)
print("Aangka:", angka)
" "êêñ
ñ÷ ÷÷
÷å åí
íè èì
ì¶ ¶ß
ß∂ ∂∏"(944d9e0419b85cf52063a30ed3ee168e608955c0*4c:\Users\ASUS\Alifa Izzatunnisa\Pengantar Pemograman