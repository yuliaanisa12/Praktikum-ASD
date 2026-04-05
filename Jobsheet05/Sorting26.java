package Jobsheet05;

public class Sorting26 {
    int data[];
    int jumData;

Sorting26(int Data,int jmlDat){
    jumData=jmlDat;
    data=new int [jmlDat];
    for (int i=0; i<jumData;i++){
        data[i]= Data;
    }
}
void bubbleSort(){
    int temp= 0;
    for (int i=0; i<jumData-1; i++){
        for (int j=1; j<jumData-i; j++){
            if (data[j]<data[j-1]){
                temp=data[j];
                data[j]=data[j-1];
                data[j-1]=temp;
            }
        }
    }
}
void tampil(){
    for (int i=0; i<jumData; i++){
        System.out.println(data[i]+" ");

    }
    System.out.println();
}
}
