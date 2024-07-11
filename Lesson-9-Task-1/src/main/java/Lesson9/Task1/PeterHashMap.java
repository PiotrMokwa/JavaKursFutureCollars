package Lesson9.Task1;

import Lesson9.OwnMap;

import java.util.Arrays;
import java.util.Objects;

public class PeterHashMap implements OwnMap {
    private final Bucket[] buckets;

    public PeterHashMap(String firstKey, String firstValue) {
        int mapLength = 101;
        this.buckets = new Bucket[mapLength];
        StoragedObject storagedObject = new StoragedObject(firstKey, firstValue);
        this.buckets[getHash()] = new Bucket(storagedObject);
    }
    private int getHash() {
        int randomNumber = (int) (Math.random() * 100);
        String[] totalLongCode = Integer.toString((Arrays.hashCode(this.buckets) + randomNumber)).split("");
        String lastDigit = totalLongCode[totalLongCode.length - 1];
        String beforeLastDigit = totalLongCode[totalLongCode.length - 2];
        int totalShortCode = Integer.parseInt((beforeLastDigit + lastDigit));
        return totalShortCode;
    }
    @Override
    public boolean put(String key, String value) {
        StoragedObject storagedObject = new StoragedObject(key, value);
        Bucket newBucket = new Bucket(storagedObject);
        int indexOfList = getHash();
        Bucket bucket = this.buckets[indexOfList];
        boolean isBucketEmpty = bucket == null;
        boolean isElementAdded;
        if (isBucketEmpty) {
            this.buckets[indexOfList] = newBucket;
            isElementAdded = true;
            return isElementAdded;
        } else {
            int listElementInBucketList = 0;
            boolean isAddedObjectEqual = false;
            for (int counterList = 0; counterList < bucket.list.size(); counterList++) {
                isAddedObjectEqual = storagedObject.equals(bucket.list.get(listElementInBucketList));
                listElementInBucketList++;
            }

            if (isAddedObjectEqual) {
                isElementAdded = false;
                return isElementAdded;
            } else {
                bucket.list.add(storagedObject);
                isElementAdded = true;
                return isElementAdded;
            }
        }
    }

    @Override
    public boolean containsKey(String key) {
        boolean isKey = false;
        int listElementInBucket;
        for (Bucket bucket : buckets) {
            if (bucket != null) {
                for (listElementInBucket = 0; listElementInBucket < bucket.list.size(); listElementInBucket++) {
                    isKey = Objects.equals(bucket.list.get(listElementInBucket).key, key);
                    if (isKey) {
                        return isKey;
                    }
                }
            }
        }
        return isKey;
    }
    @Override
    public boolean containsValue(Object value) {
        boolean isValue = false;
        int listElementInBucket;
        for (Bucket bucket : buckets) {
            if (bucket != null) {
                for (listElementInBucket = 0; listElementInBucket < bucket.list.size(); listElementInBucket++) {
                    isValue = Objects.equals(bucket.list.get(listElementInBucket).value, value);
                    if (isValue) {
                        return isValue;
                    }
                }
            }
        }
        return isValue;
    }
    @Override
    public String remove(String key) {
        boolean isKey;
        String removedValue;
        int listElementInBucket;
        for (Bucket bucket : buckets) {
            if (bucket != null) {
                for (listElementInBucket = 0; listElementInBucket < bucket.list.size(); listElementInBucket++) {
                    isKey = Objects.equals(bucket.list.get(listElementInBucket).key, key);
                    if (isKey) {
                        removedValue = bucket.list.get(listElementInBucket).value;
                        bucket.list.remove(listElementInBucket);
                        return removedValue;
                    }
                }
            }
        }
        return "The key: " + key + "Wasn't found";
    }
    @Override
    public String get(String key) {
        boolean isKey;
        int listElementInBucket;
        for (Bucket bucket : buckets) {
            if (bucket != null) {
                for (listElementInBucket = 0; listElementInBucket < bucket.list.size(); listElementInBucket++) {
                    isKey = Objects.equals(bucket.list.get(listElementInBucket).key, key);
                    if (isKey) {
                        return bucket.list.get(listElementInBucket).value;
                    }
                }
            }
        }
        return "No such a key";
    }
    public void getMap() {
        System.out.println("----------------------------------------------");
        int buckedIndexCheck = 0;
        int listElementInBucketList = 0;
        for (Bucket bucket : buckets) {
            if (bucket != null) {

                for (int counterList = 0; counterList < bucket.list.size(); counterList++) {
                    System.out.println(" Bucket nr " + buckedIndexCheck
                            + " list element nr " + listElementInBucketList
                            + "/" + bucket.list.size()
                            + " value " + bucket.list.get(listElementInBucketList).value);

                }
            }
            buckedIndexCheck++;
        }
        System.out.println("----------------------------------------------");
    }

}
