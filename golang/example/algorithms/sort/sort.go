package sort

/**
	选择排序
 */
func SelectSort(arr[] int)  {

	for i:= 0;i< len(arr) ;i++  {
		k := i
		for j := i+1;j< len(arr) ;j++  {
			if arr[k] > arr[j] {
				k = j
			}
		}
		if k != i {
			arr[k],arr[i] = arr[i],arr[k]
		}
	}
}

/**
	冒泡排序
 */
func BubleSort(arr[] int)  {
	for i:=0;i<len(arr) ;i++  {

		for j := 0;j <len(arr) -1 ;j++  {

			if arr[j] > arr[j+1] {
				arr[j],arr[j+1] = arr[j+1],arr[j]
			}
		}

	}
}

/**
	冒泡排序 改进版
 */
func BubleSortPro(arr[] int)  {

	flag := false

	for i:=0;i<len(arr) ;i++  {

		for j := 0;j <len(arr) -1 ;j++  {

			if arr[j] > arr[j+1] {
				arr[j],arr[j+1] = arr[j+1],arr[j]
				flag = true
			}
		}

		if !flag {
			break
		}else {
			flag = false
		}


	}
}
