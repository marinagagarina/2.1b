package ru.netology.service;

    class CashbackHackService {
        private final int boundary = 1000;

        public int remain(int amount) {
            return boundary - amount % boundary;
        }

        public int calculateCashback(int amount) {
            return 0;
        }
    }

