# AndroidAllCapsBug
Sample Project to demonstrate a bug with textAllCaps in AppCompatTextView.

# [VIDEO REPRODUCING THE ISSUE](AllCapsBug.mp4)

Problem:

- When toggling between two different text styles, one with `android:textAllCaps` set to `true` and the other set to `false`,
  the TextView will always display its text as fully uppercase, no matter what.
  
Expected behavior:
- When the style with `android:textAllCaps` set to `false` is set, the text should display text in its original case, not all uppercase.

Workaround:
- If using `textAllCaps` instead of `android:textAllCaps` (omitting the `android:` prefix, the behavior is correct)
