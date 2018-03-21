/*
 * Copyright (c) 2015 The Jupiter Project
 *
 * Licensed under the Apache License, version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jupiter.rpc.load.balance;

/**
 * jupiter
 * org.jupiter.rpc.load.balance
 *
 * @author jiachun.fjc
 */
final class WeightArray {

    private final int[] array;
    private int gcd;

    WeightArray(int[] array) {
        this.array = array;
    }

    int get(int index) {
        if (index >= array.length) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return array[index];
    }

    void set(int index, int value) {
        if (index >= array.length) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        array[index] = value;
    }

    int[] array() {
        return array;
    }

    int length() {
        return array.length;
    }

    int gcd() {
        return gcd;
    }

    void gcd(int gcd) {
        this.gcd = gcd;
    }

    boolean isAllSameWeight() {
        return array == null;
    }
}
