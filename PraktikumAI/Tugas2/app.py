from flask import Flask, render_template, request, redirect

app = Flask(__name__)

# List untuk menyimpan pesan sementara
pesan_list = []

@app.route("/", methods=["GET", "POST"])
def index():
    if request.method == "POST":
        nama = request.form["nama"]
        email = request.form["email"]
        telepon = request.form["telepon"]
        pesan = request.form["pesan"]

        # Simpan data ke list
        pesan_list.append({"nama": nama, "email": email, "telepon": telepon, "pesan": pesan})

    return render_template("index.html", pesan_list=pesan_list)

@app.route("/hapus/<int:index>")
def hapus(index):
    if 0 <= index < len(pesan_list):
        pesan_list.pop(index)
    return redirect("/")

if __name__ == "__main__":
    app.run(debug=True)
