class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length +  nums2.length ;

        int i=0;
        int j=0;
        int count=0;
        int ind1 = n/2;
        int ind2=(n/2)-1;

        int elem1=-1;
        int elem2=-1;

        while (i<nums1.length && j<nums2.length){
            if (nums1[i]< nums2[j]){
                if (count==ind1){
                    elem1=nums1[i];
                }
                if (count==ind2){
                    elem2=nums1[i];
                }
                i++;
                count++;
            }
            else {
                 if (count==ind1){
                    elem1=nums2[j];
                }
                if (count==ind2){
                    elem2=nums2[j];
                }
                j++;
                count++;
            }
        }   
       
        while (i < nums1.length){
            if (count==ind1){
                    elem1=nums1[i];
                }
                if (count==ind2){
                    elem2=nums1[i];
                }
                i++;
                count++;

        }

        while ( j < nums2.length ){
            if (count==ind1){
                    elem1=nums2[j];
                }
                if (count==ind2){
                    elem2=nums2[j];
                }
                j++;
                count++;
            }

            if (n%2==1){
                return elem1;
            }

             return (double) ( elem1+elem2)/2  ;



        }





            
        }

















