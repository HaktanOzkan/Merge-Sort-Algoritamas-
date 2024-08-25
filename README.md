# Merge Sort Algoritması

Bu proje, **Merge Sort** algoritmasını Java dilinde uygulayan bir programı içermektedir. Merge Sort, sıralama algoritmaları arasında en verimli olanlardan biridir ve özellikle büyük veri kümeleri için idealdir. Bu algoritma, "böl ve fethet" (divide and conquer) yöntemini kullanarak çalışır.

## Özellikler

- Verilen bir dizi veya listeyi Merge Sort algoritması kullanarak sıralar.
- Verimli ve hızlı bir sıralama sağlar.
- Büyük veri kümeleri için uygundur.

## Gereksinimler

- Java 8 veya daha yeni bir sürümü.


## Kullanım

### Komut Satırı Kullanımı

```sh
javac Main.java
java Main
```

## Örnek Kullanım
Program çalıştırıldığında, örnek bir dizi üzerinde Merge Sort algoritmasını uygular ve sıralanmış diziyi ekrana yazdırır.

```sh
int[] array = {38, 27, 43, 3, 9, 82, 10};
MergeSort.sort(array);
System.out.println(Arrays.toString(array)); // Çıktı: [3, 9, 10, 27, 38, 43, 82]
```

## Algoritmanın Çalışma Prensibi

Bölme (Divide): Dizi iki alt diziye bölünür.
Fethetme (Conquer): Alt diziler kendi içinde sıralanır.
Birleştirme (Combine): Alt diziler birleştirilerek sıralı bir dizi elde edilir.
