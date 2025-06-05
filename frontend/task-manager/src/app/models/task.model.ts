export interface Task {
  id?: number; // optional for new tasks before being saved
  title: string;
  description: string;
  status: string;
  dueDate: string; // LocalDate in Java maps to string in JSON (usually 'YYYY-MM-DD')
}
