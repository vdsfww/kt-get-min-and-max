package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
        var min = inputArray.min()
        var max = inputArray.max()
        return intArrayOf(min, max)
}
