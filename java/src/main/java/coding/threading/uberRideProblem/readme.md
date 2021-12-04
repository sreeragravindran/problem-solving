### Problem Statement 
Imagine at the end of a political conference, republicans and democrats are trying to leave the venue and ordering Uber rides at the same time. However, to make sure no fight breaks out in an Uber ride, the software developers at Uber come up with an algorithm whereby either an Uber ride can have all democrats or republicans or two Democrats and two Republicans. All other combinations can result in a fist-fight.

Your task as the Uber developer is to model the ride requestors as threads. Once an acceptable combination of riders is possible, threads are allowed to proceed to ride. Each thread invokes the method seated() when selected by the system for the next ride. When all the threads are seated, any one of the four threads can invoke the method drive() to inform the driver to start the ride.


### Solution
First let us model the problem as a class. We'll have two methods one called by a Democrat and one by a Republican to get a ride home. When either one gets a seat on the next ride, it'll call the seated() method.

To make up an allowed combination of riders, we'll need to keep a count of Democrats and Republicans who have requested for rides. We create two variables for this purpose and modify them within a lock/mutex. In this problem, we'll use the ReentrantLock class provided by java's util.concurrent package when manipulating counts for democrats and republicans.

Realize we'll also need a barrier where all the four threads, that have been selected for the Uber ride arrive at, before riding away. This is analogous to the four riders being seated in the car and the doors being shut.

Once the doors are shut, one of the riders has to tell the driver to drive which we simulate with a call to the drive() method. Note that exactly one thread makes the shout-out to the driver to drive().