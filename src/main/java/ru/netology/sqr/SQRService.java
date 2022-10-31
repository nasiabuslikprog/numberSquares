package ru.netology.sqr;

public class SQRService {
    public int compareHitSquaresRange(int rangeStart, int rangeEnd) {
        int counterSquares = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= rangeStart && i * i <= rangeEnd){

                counterSquares++;

            }



        }

        return counterSquares;

    }
}
