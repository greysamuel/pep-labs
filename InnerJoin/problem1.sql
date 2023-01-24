SELECT class.id, class.teacher_name, class.class_title
FROM class
INNER JOIN student ON class.id = student.class_title
WHERE class.id = 'Ms. Lovelace';