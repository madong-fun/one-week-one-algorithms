package search

func BinaySearch(arr [] int,item int) int {
	var low = 0
	var high = len(arr) -1

	for low < high  {
		var mid = (low+high) / 2
		guess := arr[mid]
		if guess == item {
			return mid
		}
		if guess > item{
			high = mid - 1
		}else {
			low = mid + 1
		}
	}
	return -1
}
