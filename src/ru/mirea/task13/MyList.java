package ru.mirea.task13;

public class MyList {
    private int[] array = new int[10];
    private int length = 10;//размер массива
    private int amount = 0;//количество элементов в массиве
    public MyList(){};
    //добавляет новый элемент в конец массива
    public void add(int value){
        if (amount < length){
            array[amount] = value;
        }
        else {
            resize();//увеличиваем массив
            array[amount] = value;
        }
        amount++;
    }
    //метод увеличивает массив
    public void resize(){
        //новая длина массива
        length *= 2;
        //создаем временный массив и копируем в него элементы списка
        int[] tempArray = new int[amount];
        for(int i = 0; i < amount; i++){
            tempArray[i] = array[i];
        }
        //задаем новую длину для массива и переписываем в него элементы списка
        array = new int[length];
        for(int i = 0; i < amount; i++){
            array[i] = tempArray[i];
        }
    }
    //возвращает элемент массива
    public int get(int index){
        return array[index];
    }
    //метод устанавливает новое значение для элемента, при этом все элементы после него сдвигаются
    public boolean set(int index, int value){
        if(index > length) return false;
        else{
            //создаем временный массив
            int tempLength = amount - index;
            int[] tempArray = new int[tempLength];
            //перезаписываем элементы во временный массив
            for(int i = index; i < amount; i++){
                tempArray[i-index] = array[i];
            }
            array[index] = value;
            if(amount+1 <= length) {
                amount++;
                //перезаписываем элементы обратно в массив
                for (int i = index + 1; i < amount; i++) {
                    array[i] = tempArray[i - index - 1];
                }
            }
            else if (amount+1 > length){
                resize();
                amount++;
                //перезаписываем элементы обратно в массив
                for (int i = index + 1; i < amount; i++) {
                    array[i] = tempArray[i - index - 1];
                }
            }
            return true;
        }
    }
    //возвращает длину списка(количество элементов)
    public int length(){
        return this.amount;
    }
    //метод возвращает индекс первого вхождения элемента в список
    public int indexOf(int value){
        for(int i = 0; i < amount; i++){
            if(array[i] == value) return i;
        }
        return -1;
    }
    //возвращает индекс последнего вхождения элемента в список
    public int lastIndexOf(int value){
        for(int i = amount-1; i >= 0 ; i--){
            if(array[i] == value) return i;
        }
        return -1;
    }
    //удвление элемента из списка
    public int remove(int index){
        if(index < length) {
            //создаем временный массив
            int tempLength = amount - index - 1;
            int[] tempArray = new int[tempLength];
            //записываем элементы во временный массив
            for (int i = index + 1; i < amount; i++) {
                tempArray[i - index - 1] = array[i];
            }
            //переменная хранит удаляемый элемент
            int removedElem = array[index];
            amount--;
            for (int i = index; i < amount; i++) {
                array[i] = tempArray[i - index];
            }
            return removedElem;
        }
        else return -1;
    }
    //сортировка списка
    public void sort(){
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < amount - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
    //метод получает набор элементов, которые находятся между индексами start и end
    public int[] subList(int start, int end){
        if((start < amount) && (end < amount) && (start < end)) {
            int[] tempArray = new int[end - start + 1];
            for (int i = start; i <= end; i++) {
                tempArray[i - start] = array[i];
            }
            return tempArray;
        }
        int[] wrongArray = new int[0];
        return wrongArray;
    }
}
