// enums -> a collection of named constants
enum OrderStatus {
  PENDING,
  PAID,
  CANCELLED,
  DELIVERED,
  EXPIRED,
  REFUNDED,
  REJECTED,
  REFUNDED_AND_RETURNED,
  RETURNED,
}

function orderStatusToString(status: OrderStatus): string {
  switch (status) {
    case OrderStatus.PENDING:
      return "pending";
    case OrderStatus.PAID:
      return "paid";
    case OrderStatus.CANCELLED:
      return "cancelled";
    case OrderStatus.DELIVERED:
      return "delivered";
    case OrderStatus.EXPIRED:
      return "expired";
    case OrderStatus.REFUNDED:
      return "refunded";
    case OrderStatus.REJECTED:
      return "rejected";
    case OrderStatus.REFUNDED_AND_RETURNED:
      return "refunded and returned";
    case OrderStatus.RETURNED:
      return "returned";
  }
}


console.log(orderStatusToString(OrderStatus.PENDING));