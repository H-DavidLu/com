package com;

public class SizeBlock {

    public static void main(String[] args) {
        SizeBlock sizeBlock = new SizeBlock();
        System.out.println(sizeBlock.calculateSize(1));
        System.out.println(sizeBlock.calculateSize(-8));
        System.out.println(sizeBlock.calculateSize(568));
        System.out.println(sizeBlock.calculateSize(8192));
        System.out.println(sizeBlock.calculateSize(8585));
    }

    public String calculateSize(int fileSize){
        if(fileSize <0){
            return "Please re-enter the valid number: " + Integer.toString(fileSize);
        }

        int sizeBlock =4096;
        int numBlock = (int)Math.floor(fileSize/sizeBlock);
        int finalSize = 0;

        if(fileSize%sizeBlock!=0){
            finalSize = sizeBlock+ numBlock*sizeBlock;
            return "The block size of " + fileSize+ " is " + Integer.toString(finalSize);
        }
        else{
            return "The block size of " + fileSize+ " is " +  numBlock*sizeBlock;
        }
    }
}
