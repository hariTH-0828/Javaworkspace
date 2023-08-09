package workSpace.src.workSpace;

import java.util.Random;
public class CarParking {
    int[][] matrix; int size;
    int firstCar, secondCar; int parkingPoint;
    public CarParking(int size) {
        this.size = size;
        this.matrix = new int[size][size];
    }

    public void parkCar(){
        firstCar = new Random().nextInt(1, size);
        secondCar = new Random().nextInt(1, size);

        if(firstCar != secondCar){
            matrix[firstCar][0] = 1;
            matrix[secondCar][0] = 2;
        } else {
            parkCar();
        }
    }

    public void setParkingLocation(){
        parkingPoint = new Random().nextInt(1, size);
        matrix[parkingPoint][size - 1] = 99;
    }

    public void checkNearBy(){
        int distanceOfFirstCar = Math.abs(parkingPoint - firstCar);
        int distanceOfSecondCar = Math.abs(parkingPoint - secondCar);

        if(distanceOfFirstCar > distanceOfSecondCar) {
            System.out.println("Second car is near to the location");
            printPath(secondCar);
        }
        else{
            System.out.println("First Car is near to the location");
            printPath(firstCar);
        }
    }

    private void printPath(int location){
        int i;
        for(i = 1; i < size; i++){
            System.out.print("("+location+","+i+")");
        }
        System.out.println();
        // check move down or up
        int direction = parkingPoint - location;
        if(direction > 0) {
            i -= 1;
            for(int j = location + 1; j <= parkingPoint; j++) {
                System.out.print("(" + j + "," + i + ")");
            }
        }else {
            i -= 1;
            for(int j = location - 1; j >= parkingPoint; j--){
                System.out.print("("+j+","+i+")");
            }
        }
    }

    @Override
    public String toString() {
        for(int[] i : matrix){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return " ";
    }

    public static void main(String[] args) {
        CarParking carParking = new CarParking(10);
        carParking.parkCar();
        carParking.setParkingLocation();
        System.out.println(carParking);
        carParking.checkNearBy();
    }
}
