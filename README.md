# Jorge González Burgos
1ºDAM -- Entornos de desarrollo -- UML -- P01 Investiga y resuelve

## 6. Cuestiones de análisis

### ¿Qué tipo de relación se define en el diagrama UML entre `Pedido` y `Producto`?

En la relación que se define, un pedido está formado por uno o varios productos, por lo que un producto no tiene sentido que exista si no pertenece a un pedido.

---

### ¿Qué significa la cardinalidad indicada en esa relación?

La cardinalidad que se indica es 1..0, lo que significa que un **pedido** puede tener **ninguno o varios productos**, mientras que un **producto** pertenece a **un solo pedido**.

---

### ¿Qué otros tipos de cardinalidad se pueden definir en UML?

Por lo que he investigado, las cardinalidades en UML pueden ser:

- **1..1** --> La relación se da con un solo objeto (Una persona solo tiene un DNI).
- **0..1** --> La relación puede existir o no (Una persona puede o no ser dueño de una casa).
- **1..** --> La relación se da con uno o varios objetos (Una empresa tiene uno o varios trabajadores).
- **0..** --> La relación puede ser con ninguno o con muchos objetos (Un cliente puede comprar ninguno o muchos productos).

---

### ¿Qué diferencia existe entre una asociación, una agregación y una composición?

Según he investigado, las diferencias entre las tres sería algo así:

- **Asociación** Relación general entre dos clases, que no implica dependencia entre los objetos (Un profesor imparte varias asignaturas).

- **Agregación** Relación débil pero solo por parte de uno de los objetos (Un libro existe en la librería, pero seguirá existiendo aunque la librería no esté).

- **Composición** Relación débil en la que si el objeto principal falla, los demás también (Una casa tiene habitaciones, si la casa desaparece, las habitaciones también).

  
  
