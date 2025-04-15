class DataDosen10 {
    Dosen10[] dataDosen10 = new Dosen10[10];
    int idx = 0;

    public void tambah(Dosen10 dsn) {
        if (idx < dataDosen10.length) {
            dataDosen10[idx++] = dsn;
        } else {
            System.out.println("data sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen10[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen10[j - 1].usia > dataDosen10[j].usia) {
                    Dosen10 temp = dataDosen10[j];
                    dataDosen10[j] = dataDosen10[j - 1];
                    dataDosen10[j - 1] = temp;
                }
            }
        }
    }

    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen10[j].usia > dataDosen10[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen10 temp = dataDosen10[i];
            dataDosen10[i] = dataDosen10[maxIdx];
            dataDosen10[maxIdx] = temp;
        }
    }

    public void pencarianDataSequential(String nama) {
        Dosen10[] hasil = new Dosen10[idx];
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen10[i].nama.equalsIgnoreCase(nama)) {
                hasil[count++] = dataDosen10[i];
            }
        }
        if (count > 0) {
            System.out.println("Dosen ditemukan: ");
            for (int i = 0; i < count; i++) {
                hasil[i].tampil();
            }
            if (count > 1) {
                System.out.println("Peringatan: Ditemukan lebih dari satu hasil!");
            }
        } else {
            System.out.println("Dosen tidak ditemukan.");
        }
    }

    public void pencarianDataBinary(int usia) {
        sortingASC();

        int left = 0, right = idx - 1, mid;
        Dosen10[] hasil = new Dosen10[idx];
        int count = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (dataDosen10[mid].usia == usia) {
                int temp = mid;
                while (temp >= 0 && dataDosen10[temp].usia == usia) {
                    hasil[count++] = dataDosen10[temp--];
                }
                temp = mid + 1;
                while (temp < idx && dataDosen10[temp].usia == usia) {
                    hasil[count++] = dataDosen10[temp++];
                }
                break;
            } else if (dataDosen10[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (count > 0) {
            System.out.println("Dosen ditemukan:");
            for (int i = 0; i < count; i++) {
                hasil[i].tampil();
            }
            if (count > 1) {
                System.out.println("Ditemukan lebih dari satu hasil!");
            }
        } else {
            System.out.println("Dosen tidak ditemukan.");
        }
    }

}