### Scope of Improvements
- Multi-Elevator Support
- Event Driven Architecture
- Door Management State
- Concurrency Handling
- Smart Scheduling
- Passenger Capacity Constraints


Behavior → State Pattern
Decision → Scheduler
Execution → Service
Data → Model
Access → Controller


### problems in this approach : 

- Single elevator ,But real buildings have:

  10–50 elevators

  Problem:Who decides WHICH elevator should serve request?

Currently:

👉 No global intelligence.


Issue 2 — ❌ Polling (step()) Architecture Does Not Scale
Current Design
while(true){
elevatorService.step(elevator);
}

This is called polling simulation.

Why It Breaks at Scale

Imagine:

50 elevators
1000 requests/sec

Now system continuously checks:

Any request?
Any request?
Any request?

CPU waste 🔥

Real systems are event-driven, not loop-driven.


Issue 3 — ❌ State Transition Creates Objects Repeatedly
Current Code
elevator.setState(new MovingUpState());

Every transition creates new object.

Why This Is Bad

In large system:

Thousands of transitions/sec

Creates:

GC pressure
Memory churn
Latency spikes
Production Fix

States should be singletons.

Correct Approach
public class MovingUpState implements ElevatorState {

    private static final MovingUpState INSTANCE =
        new MovingUpState();

    private MovingUpState(){}

    public static MovingUpState getInstance() {
        return INSTANCE;
    }
}

Usage:

elevator.setState(
MovingUpState.getInstance());

✅ Zero object creation
✅ Memory efficient
✅ Production-safe