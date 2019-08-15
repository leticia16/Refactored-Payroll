package main;

public enum PayRollOptions {
    PAY1{
        public StrategyPayRoll optionPayRoll(){
            return new Pay1();
        }
    },
    PAY2{
        public StrategyPayRoll optionPayRoll(){
            return new Pay2();
        }
    };
    public abstract StrategyPayRoll optionPayRoll();
}
