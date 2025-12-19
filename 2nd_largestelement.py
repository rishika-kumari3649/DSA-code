def second_largest(arr):
    if len(arr) < 2:
        return "Array must have at least two elements"

    largest = second_largest = float('-inf')

    for num in arr:
        if num > largest:
            second_largest = largest
            largest = num
        elif largest > num > second_largest:
            second_largest = num

    if second_largest == float('-inf'):
        return "No second largest element"

    return second_largest


# Example
arr = [10, 5, 20, 8, 15]
print("Second Largest Element:", second_largest(arr))
