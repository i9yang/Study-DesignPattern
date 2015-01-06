package ch17_state;

public enum State {
    HUNGRY {
        public State act(Action action) {
            switch (action) {
            case EAT:
                return FULL;
            default:
                return null;
            }
        }
    },
    FULL {
        public State act(Action action) {
            switch (action) {
            case EAT:
                return ANGRY;
            case DIGEST:
                return HUNGRY;
            case GOTOBED:
                return SLEEPING;
            default:
                return null;
            }
        }
    },
    ANGRY {
        public State act(Action action) {
            switch (action) {
            case DIGEST:
                return FULL;
            default:
                return null;
            }
        }
    },
    SLEEPING {
        public void onEntry(){
            System.out.println("이부자리깜.");
        }
        public State act(Action action) {
            return null;
        }
    };
    abstract State act(Action action);

    public static State getInitState() {
        return HUNGRY;
    }

    public static boolean isFinalState(State arg) {
        return arg == SLEEPING;
    }
    public void onEntry(){}
    public void onExit(){}
}

