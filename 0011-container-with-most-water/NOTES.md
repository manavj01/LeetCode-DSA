N square approach
```
int max = Integer.MIN_VALUE;
​
for (int i = 0; i < height.length; i++) {
for (int j = i + 1; j < height.length; j++) {
max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
}
}
return max;
```